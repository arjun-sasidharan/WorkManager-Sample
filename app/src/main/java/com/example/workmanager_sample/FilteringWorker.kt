package com.example.workmanager_sample

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class FilteringWorker(context: Context, params: WorkerParameters) : Worker(context, params) {

    override fun doWork(): Result {
        // code to execute deferrable task
        return try {
            for (i in 0..600) {
                Log.i("MYTAG", "Filtering $i")
            }
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }

    }
}