set SCRIPT_DIR=%~dp0
java -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -Xmx712M -Xss2M -javaagent:"%SCRIPT_DIR%"\jrebel.jar -jar "%SCRIPT_DIR%\sbt-launch.jar" %*
