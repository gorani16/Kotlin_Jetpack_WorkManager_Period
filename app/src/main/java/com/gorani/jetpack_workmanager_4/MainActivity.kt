package com.gorani.jetpack_workmanager_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

/**
 * WorkManager 주기적 실행
 * 어떤 특정 로직(작업) 을 15분마다 / 30분 마다 / 1시간 마다 실행시키고 싶을 때 사용한다.
 *
 * PeriodicWorkRequestBuilder 를 사용하여 주기를 설정하여 설정한 주기마다 작업을 실행시킬 수 있다.
 * PeriodicWorkRequestBuilder 를 보면 최소 주기간격은 15임을 알 수 있다. (repeatInterval)
 * 그 옆의 Parameter 인 TimeUnit 으로 분, 시간, 일 등 설정할 수 있다.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // WorkManager 주기적 실행 : 15분 마다 WorkManager 의 doWork() 가 실행된다.
        val workManager = PeriodicWorkRequestBuilder<WorkManagerA>(15, TimeUnit.MINUTES).build()
        WorkManager.getInstance(this).enqueue(workManager)

    }
}