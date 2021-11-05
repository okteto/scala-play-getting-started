# Learn how to build an application using Scala, the Play Framework, and Okteto

This example shows how to develop a service using Scala and the Play Framework in a remote development powered by Okteto.

[![Develop on Okteto](https://okteto.com/develop-okteto.svg)](https://cloud.okteto.com/deploy?repository=https://github.com/okteto/scala-play-getting-started)


## Deploy our development environment in Okteto Cloud

You can deploy your environment by clicking on the green button above, or by cloning the repo and running:

```
$ okteto stack deploy --build
```

## Remote Development

After deploying your remote development environment, run `okteto up` to connect your local machine with your development environment. 

```
$ okteto up
```

```
 i  Using play-rberrelleza @ cloud.okteto.com as context
 ✓  Images successfully pulled
 ✓  Files synchronized
    Context:   cloud.okteto.com
    Namespace: play-rberrelleza
    Name:      app
    Forward:   5005 -> 5005
               9000 -> 9000
```

On the new terminal, run `sbt run` to start sbt and your application. Once the application is running, you will be able to access it via http://locahost:9000, or through the https endpoint generated in Okteto Cloud.

Your development environment is ready for you. Every time you save a file locally, `okteto`  will synchronize your changes and `sbt` will automatically reload the application.

## Remote Debugging

You can remote the process running in your remote development environment from your local machine. To do this, you need to perform the following steps:
1. Start  `sbt` in debugger mode
```
root@app:/usr/src/app# sbt -jvm-debug 5005
```

2. Configure your IDE to connect to attach to a remote JVM using `localhost:5005`

3. Start your remote debugging session. 

If you're using Intellij, [this article explains the entire process pretty well](https://www.jetbrains.com/help/idea/tutorial-remote-debug.html#15b282d4).