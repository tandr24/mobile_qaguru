# Test Mobile Automation Project for [Wikipedia](https://github.com/wikimedia/apps-android-wikipedia)

Wikipedia is a free online encyclopedia, created and edited by volunteers around the world and hosted by the Wikimedia Foundation.

## **Contents:**
____

* <a href="#tools">Technologies and tools</a>

* <a href="#cases">Examples of automated test cases</a>

* <a href="#console">Run from terminal</a>

* <a href="#allure">Allure report</a>

* <a href="#allure-testops">Integration with Allure TestOps</a>

* <a href="#telegram">Telegram notifications via bot</a>

* <a href="#video">Example videos of test execution on Selenoid</a>
____
<a id="tools"></a>
## <a name="Technologies and tools">**Technologies and tools:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

____
<a id="cases"></a>
## <a name="Examples of automated test cases">**Examples of automated test cases:**</a>
____
- ✓ *Verify search works and shows certain page*
- ✓ *Verify page is opened after click on it*
- ✓ *Verify that onboarding instruction gives all expected action*

____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Build"></a>Build in [Jenkins](https://jenkins.autotests.cloud/job/qa_mobile/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/qa_mobile/"><img src="images/screen/jenkins_build.jpeg" alt="Jenkins" width="950"/></a>  
</p>


### **Build parameters in Jenkins:**

- *deviceHost(browserstack, emulation)

for browserstack configuration:
- *userName={userName}
- *accessKey={accessKey}
- *platform=android
- *os_version=12.0
- *device=Samsung Galaxy S22 Ultra

for emulation configuration:
- *platform.name=Android
- *device.name=Pixel 7
- *device.avd =Pixel_7

<a id="console"></a>
## Commands for running from terminal
___
***Local run:***
```bash  
gradle clean test -DdeviceHost=browserstack
```

***Remote run via Jenkins:***
```bash  
clean test
-DdeviceHost={deviceHost}
-DuserName={userName}
-DaccessKey={accessKey}
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [report](https://jenkins.autotests.cloud/job/qa_mobile/8/allure/)</a>
___

### *Main report page*

<p align="center"> <img title="Allure Overview Dashboard" src="images/screen/mainPageAllure.jpeg" width="850"> </p>

### *Test cases*

<p align="center"> <img title="Allure Tests" src="images/screen/AllureTests.jpeg" width="850"> </p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Example videos of test execution on Browserstack
____
<p align="center">
<img title="Selenoid Video" src="images/video/video.gif" width="550" height="350"  alt="video">   
</p>
