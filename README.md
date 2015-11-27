# 配置运行使用本地静态资源加载

__ 主要目的 __

用于解决，远端页面无法访问本地资源

主要优化成果，解决cordova插件过多情况下，当UI层使用远点UI制作时，无法加载本地cordova插件js

__ 附带解决 __

www目录下的css,js,img的访问权限

__ 支持平台 __

暂时只支持android

__ 如何使用 __

修改访问地址：

* android (localfile:// 标识代表相对路径 file://android_asset/www/)

````
/**
 * 加载本地js
 */
 <script type="text/javascript" src="localfile://js/index.js"></script>
 /**
  * 加载本地css
  */
 <link rel="stylesheet" rev="stylesheet" type="text/css" href="localfile://css/index.css">
 /**
  * 加载本地图片 现支持格式(jpg,jpeg,png,gif)
  */
 <img src="localfile://img/icon.png">
````

### author : rockywu
### github : http://github.com/rockywu
### email  : wjl19890427@hotmail.com
