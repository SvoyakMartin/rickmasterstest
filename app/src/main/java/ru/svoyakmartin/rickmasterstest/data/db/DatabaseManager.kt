package ru.svoyakmartin.rickmasterstest.data.db

import io.realm.Realm
import io.realm.kotlin.executeTransactionAwait
import kotlinx.coroutines.Dispatchers
import ru.svoyakmartin.rickmasterstest.domain.model.Camera
import ru.svoyakmartin.rickmasterstest.domain.model.Door
import javax.inject.Inject

class DatabaseManager @Inject constructor(private val realm: Realm) {
    suspend fun getCameras(): List<Camera> {
        val camerasList = mutableListOf<Camera>()
        realm.executeTransactionAwait(Dispatchers.IO) { transaction ->
            camerasList.addAll(transaction.where(Camera::class.java).findAll())
        }

        return camerasList
    }

    suspend fun getDoors(): List<Door> {
        val doorsList = mutableListOf<Door>()
        realm.executeTransactionAwait(Dispatchers.IO) { transaction ->
            doorsList.addAll(transaction.where(Door::class.java).findAll())
        }

        return doorsList
    }

    suspend fun saveCameras(cameras: List<Camera>) {
        realm.executeTransactionAwait(Dispatchers.IO) { transaction ->
            transaction.insert(cameras)
        }
    }

    suspend fun saveDoors(doors: List<Door>) {
        realm.executeTransactionAwait(Dispatchers.IO) { transaction ->
            transaction.insert(doors)
        }
    }

    suspend fun updateCameraName(cameraId: Int, newName: String) {
        realm.executeTransactionAwait(Dispatchers.IO) { transaction ->
            val camera = transaction.where(Camera::class.java).equalTo("id", cameraId).findFirst()
            camera?.name = newName
        }
    }
}