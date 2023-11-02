# MAD_Practical-8_21012011129

AIM:What is BroadcastReceiver? Difference between Service and BroadcastReceiver. Create an Alarm application by using service & BroadcastReceiver by following below instructions.

Create MainActivity according to below UI design.

Create AlarmBroadcastReceiver class

Create AlarmService Class

Add android.permission.SCHEDULE_EXACT_ALARM Permission in Manifest file

ANS: ->Broadcast Receivers allow us to register for the system and application events, and when that event happens, then the register receivers get notified.

Different: -> Service can continue running in the background, whereas a Broadcast Receiver should finish quickly (e.g. if it is running for more than 5 seconds it may be killed by the OS). The Broadcast Receiver can still run in the background (when app is closed) under certain circumstances.
