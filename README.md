# AndroidLearn
this is a android learning project for beginner

1.version

2.structure
2.1.	Project structure
1).gradle  => as自动生成，无须关心（as采用gradle项目构建工具）
2).idea    => 同上
3)app     => 项目代码/资源等几乎所有内容都放在这里
4)build    => 编译自动生成的相关文件
5)gradle   => gradle wrapper的配置文件
6).gitignore         => 用于版本控制
7)build.gradle       => 全局gradle构建脚本
8)gradle.properties   => 全局的gradle配置文件
9)gradlew/gradlew.bat => linux/max/windows用来执行gradle命令
10)XXX.iml        => 标识intellij IDEA项目
11)local.properties   => 自动生成，指定android sdk路径
12)settings.gradle    => 指定项目中所有引入的模块

2.2.	app folder structure
1)build    => 同外层build目录类似，也是包含一些编译时自动生成的文件
2)libs     => 项目中使用的第三方jar包，会自动被添加到构建路径里去的
3)src/androidTest => 用于编写Android Test测试用例，可对项目进行自动化测试
4)src/main/java  => 放置项目代码
5)src/main/res   => 放置项目资源
6)src/main/AndroidManifest.xml => 项目配置文件（组件注册，权限声明等）
7)test       => 用于编写Unit Test测试用例
8).gitignore  => 和外层类似，将app模块内的目录或文件排除在版本控制之外
9)app.iml          => intellij IDEA项目自动生成
10)build.gradle      => app模块的gradle构建脚本
11)proguard-rules.pro => 代码混淆规则，防止破解

2.3.	密度density
Android的基本密度是mdpi，其他密度都是相对于mdpi的比例：
0.75x – low-density (ldpi)
1.0x – medium-density (mdpi)
1.5x – high-density (hdpi)
2.0x – extra-high-density (xhdpi)
3.0x – extra-extra-high-density (xxhdpi)
4.0x – extra-extra-extra-high-density (xxxhdpi)
划分规则：
ldpi – ~120dpi
mdpi – ~160dpi
hdpi – ~240dpi
xhdpi – ~320dpi
xxhdpi – ~480dpi
xxxhdpi – ~640dpi

3.activity & life cycle
活动的4种状态：
运行：当一个活动位于返回栈的栈顶时，这个活动就处于运行状态
暂停：当一个活动不再处于栈顶位置，但仍然可见时，活动就进入暂停状态
停止：当一个活动不再处于栈顶位置，并且完全不可见，就进入停止状态
销毁：当一个活动从返回栈中移除后就变成了销毁状态

onCreate：第一次创建活动时调用，执行一些在整个life中只发生一次的初始化。参数savedInstanceState包含之前保存的状态
onStart：活动由不可见变为可见时调用，onStart使活动变为可见（为活动进入前台做准备，this method is where the app initializes the code that maintains the UI）
onResume：活动进入前台(foreground)时(准备好和用户交互)触发；直到该程序失去焦点(比如有电话进入)；这里用于初始化和用户交互相关的东西，比如初始化摄像头
onPause：用户离开活动时触发（user is leaving your activity）；这里通常用来释放一些消耗cpu的资源，比如停止播放音乐；释放摄像头等
onStop：活动不可见时触发；这里用来释放几乎所有资源
onDestroy：活动销毁前触发，所有没有释放的资源，都在这里释放
onRestart：活动由停止状态变为运行状态之前调用

The system never kills an activity directly. Instead, it kills the process in which the activity runs, destroying not only the activity but everything else running in the process, as well.
The system kills processes when it needs to free up RAM; the likelihood of its killing a given process depends on the state of the process at the time. Process state, in turn, depends on the state of the activity running in the process.

4.一键退出App

5.launchMode

6.Layouts(ViewGroup) & Widgets(View)
AlertDialog
