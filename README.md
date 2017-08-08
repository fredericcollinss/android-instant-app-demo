# android-instant-app-demo
This is an app that is used to demo android instant app feature

# The development process
This app contains 3 main modules: Main Module, Internet Module, Permission Module. Each module represents an independent feature
of the app. 
- The Main Module is the main entry to the app. It can launch other modules within the app. An deep link was integrated into the
MainActivity within this module so that the activity can be launched via a link. 
- Internet Module can fetched recent photo thumbnails from Flickr API. This module is used to illustrate the use of networking
within the context of an instant app. Besides, this module also use RecyclerView to display photo thumbnails fetched from Flickr.
This demostrates the use of RecyclerView as well.
- Permission Module is used to request runtime permission. This module is meant to test the ability to ask for runtime permission 
within instant app context.

# Conclusions
- Instant app can run very fast on a decent internet connection. It seems to perform faster than web app if the size of the app is
small. However, there are some limitations related to instant app such as the lack of background services, do background notifications, 
or access unique device identifiers. (Refer to: https://developer.android.com/topic/instant-apps/index.html for more information)


