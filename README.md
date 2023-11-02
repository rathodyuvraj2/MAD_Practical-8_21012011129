# MAD_Practical-8_21012011129

AIM:What is BroadcastReceiver? Difference between Service and BroadcastReceiver. Create an Alarm application by using service & BroadcastReceiver by following below instructions.

Create MainActivity according to below UI design.

Create AlarmBroadcastReceiver class

Create AlarmService Class

Add android.permission.SCHEDULE_EXACT_ALARM Permission in Manifest file

ANS: ->Broadcast Receivers allow us to register for the system and application events, and when that event happens, then the register receivers get notified.

Different: -> Service can continue running in the background, whereas a Broadcast Receiver should finish quickly (e.g. if it is running for more than 5 seconds it may be killed by the OS). The Broadcast Receiver can still run in the background (when app is closed) under certain circumstances.

**Output:**

![WhatsApp Image 2023-11-01 at 23 43 10_dbe71dd1](https://github.com/rathodyuvraj2/MAD_Practical-8_21012011129/assets/124398921/149c7475-e2b0-4e05-a54f-e753575f3f05)

![WhatsApp Image 2023-11-01 at 23 43 10_b8309a88](https://github.com/rathodyuvraj2/MAD_Practical-8_21012011129/assets/124398921/29676ced-28c3-445e-9e5d-b247f4d3b0a6)

![WhatsApp Image 2023-11-01 at 23 43 10_96534ceb](https://github.com/rathodyuvraj2/MAD_Practical-8_21012011129/assets/124398921/4b8e8dd6-7681-4e70-b883-90de3caf7a80)
