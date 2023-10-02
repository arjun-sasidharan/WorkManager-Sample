package com.example.workmanager_sample

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class UploadWorker(context: Context, params: WorkerParameters) : Worker(context, params) {

    override fun doWork(): Result {
        // code to execute deferrable task
        try {
            for (i in 0..600000) {
                Log.i("MYTAG", "Uploading $i")
            }
            return Result.success()
        } catch (e: Exception) {
            return Result.failure()
        }

    }
}