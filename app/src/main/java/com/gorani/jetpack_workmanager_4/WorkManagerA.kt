package com.gorani.jetpack_workmanager_4

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.text.SimpleDateFormat
import java.util.*

class WorkManagerA(
    context: Context, workerParameters: WorkerParameters
) : Worker(context, workerParameters) {

    override fun doWork(): Result {

        Log.d("WorkManagerA!!!", "doWork!")

        val format = SimpleDateFormat("hh:mm:ss", Locale.KOREA)
        val currentTime = format.format(Date())

        Log.d("WorkManagerA!!!", currentTime)

        return Result.success()
    }
}