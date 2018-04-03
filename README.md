# LintDemo
自定义lint实践

lintJar  定义具体lint规则用来生成lint.jar

lintaar  将lintJar生成的规则的lint.jar包打入aar包中

最后将生成的aar包放入项目中,重启androidStudio后,会根据aar包中的lint.jar进行规则检测

参考文档 
美团《Android自定义Lint实践》 https://tech.meituan.com/android_custom_lint.html

LinkedIn提供了另一种思路 : 将jar放到一个aar中。这样我们就可以针对工程进行自定义Lint，lint.jar只对当前工程有效。
详细介绍请看LinkedIn博客： 
《Writing Custom Lint Checks with Gradle。》 https://engineering.linkedin.com/android/writing-custom-lint-checks-gradle
