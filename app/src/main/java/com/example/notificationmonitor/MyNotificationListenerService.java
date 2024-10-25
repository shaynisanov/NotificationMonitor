package com.example.notificationmonitor;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class MyNotificationListenerService extends NotificationListenerService{
    // Called when a notification is posted
    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        // Log the notification details
        Log.d("NotificationListener", "Notification posted: " + sbn.getPackageName() + " - " + sbn.getNotification().extras.getString("android.title"));
        // Here you can add code to handle the notification (e.g., save it, display it, etc.)
    }
}


