---
layout: default
title: Map DB
permalink: Map-DB
parent: Environments
---

# MapDB embedded database

Allows to use file based embedded database to persist [BotContext](https://github.com/just-ai/jaicf-kotlin/blob/master/core/src/main/kotlin/com/justai/jaicf/context/BotContext.kt) instances.

_Built on top of [MapDB](https://github.com/jankotek/mapdb) library._

> Learn more about context [here](https://github.com/just-ai/jaicf-kotlin/wiki/context).

# Advantages

The main advantage of this manager is the simplicity of its configuration.
All you need to start using it is some file name where the data will be stored.

# Requirements

Please note that all your custom data classes should implement `Serializable` interface to be able to be stored.

# How to use

#### 1. Include Map DB dependency to your _build.gradle_

```kotlin
implementation("com.just-ai.jaicf:mapdb:$jaicfVersion")
```

**Replace `$jaicfVersion` with the latest version ![](https://img.shields.io/github/v/release/just-ai/jaicf-kotlin?color=%23000&label=&style=flat-square)**

#### 2. Configure Map DB manager

```kotlin
val templateBot = BotEngine(
    scenario = MainScenario,
    contextManager = MapDbBotContextManager(".db"),
    activators = arrayOf(
        AlexaActivator
    )
)
```
