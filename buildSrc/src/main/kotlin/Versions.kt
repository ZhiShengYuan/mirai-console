/*
 * Copyright 2019-2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AFFERO GENERAL PUBLIC LICENSE version 3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

@file:Suppress("MemberVisibilityCanBePrivate", "ObjectPropertyName", "unused")

object Versions {
    const val core = "1.3.3"
    const val console = "1.0.0-dev-1"
    const val consoleGraphical = "0.0.7"
    const val consoleTerminal = console

    const val kotlinCompiler = "1.4.20-RC"
    const val kotlinStdlib = "1.4.10"

    const val kotlinIntellijPlugin = "1.4.20-RC-IJ2020.2-1" // -release
    const val intellij = "2020.2.1"


    const val coroutines = "1.4.0"
    const val serialization = "1.0.1"
    const val ktor = "1.4.1"
    const val atomicFU = "0.14.4"

    const val androidGradle = "3.6.2"

    const val bintray = "1.8.5"

    const val blockingBridge = "1.4.1"

    @Suppress("SpellCheckingInspection")
    const val yamlkt = "0.7.3"

    const val intellijGradlePlugin = "0.4.16"
}

const val `kotlin-compiler` = "org.jetbrains.kotlin:kotlin-compiler:${Versions.kotlinCompiler}"

const val `kotlin-stdlib` = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinStdlib}"
const val `kotlin-stdlib-jdk8` = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinStdlib}"
const val `kotlin-reflect` = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlinStdlib}"
const val `kotlin-test` = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlinStdlib}"
const val `kotlin-test-junit5` = "org.jetbrains.kotlin:kotlin-test-junit5:${Versions.kotlinStdlib}"

const val `kotlinx-coroutines-core` = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
const val `kotlinx-coroutines-jdk8` = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:${Versions.coroutines}"

const val `kotlinx-serialization-core` = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.serialization}"
const val `kotlinx-serialization-json` = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization}"
const val `kotlinx-serialization-protobuf` = "org.jetbrains.kotlinx:kotlinx-serialization-protobuf:${Versions.serialization}"

const val `kotlinx-atomicfu` = "org.jetbrains.kotlinx:atomicfu:${Versions.atomicFU}"

const val `mirai-core` = "net.mamoe:mirai-core:${Versions.core}"
const val `mirai-core-qqandroid` = "net.mamoe:mirai-core-qqandroid:${Versions.core}"
const val `mirai-core-api` = "net.mamoe:mirai-core-api:${Versions.core}"

const val yamlkt = "net.mamoe.yamlkt:yamlkt:${Versions.yamlkt}"

const val `jetbrains-annotations` = "org.jetbrains:annotations:19.0.0"


const val `caller-finder` = "io.github.karlatemp:caller:1.0.1"
