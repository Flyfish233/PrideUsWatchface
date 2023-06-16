# Project Delilah

> 中文请见下方

**Delilah** is a set of watch face templates for Wear OS 4. It is based on
**Watch Face Format**, WFF.

This branch is an analog watch face called **Pride Us**, which is a simple analog watch face with
Pride flag colors, for Pride Month and our all LGBTQ+ friends.

For branch `main`, it is a simple digital watch face.

## Features

[Available]

- Analog watch face
- Pride Flag colors, editable
- Enable / Disable second hand for battery saving
- Disable Second Hand when Ambient Mode
- Localized for EN, ZH-CN - Colors are not finished yet

[WIP]

- Complication Slot
- No TalkBack support yet
- More watch face templates

## What is WFF?

> The Watch Face Format is a declarative XML format to design the appearance and behavior of watch
> faces. This means that there is no executable code involved in creating a watch face, and there
> will
> be no code embedded in your watch face APK.
>
> Introduced in 2023 Google I/O.
>
> [Introducing the Watch Face Format for Wear OS](https://android-developers.googleblog.com/2023/05/introducing-watch-face-format-for-wear-os.html)

*Watch Face Format only available on Wear OS 4 and above。*

### Screenshots

![Watch Face screenshot with Pixel Watch skin](/resources/screenshots/pride_us.png)

## Reference

- [Training - Watch Face Format](https://developer.android.com/training/wearables/wff)
- [XML Reference - Watch Face Format](https://developer.android.com/training/wearables/wff/watch-face)

## What is the purpose of this project?

- Docs are not clear enough
- No official sample

## Not working on my watch

You must understand Watch Face Format before using this project, anon.

All features here **Introduced in Wear OS 4, which is not available on Wear OS 3 and below.**

## How to run

- Build Gradle
- Start Wear OS **4** Emulator
- Add a configuration for this app and run it on the emulator
- Manually select watch face

## 中文

# Project Delilah

**Delilah** 是一个基于 **Watch Face Format** (WFF) 的 Wear OS 4 手表表盘模板集合。

本分支是一个名为 **骄傲同行** 的模板表盘。它是一个简单的模拟表盘，使用彩虹旗的颜色，以迎接 Pride Month
和我们所有的 LGBTQ+ 朋友。

对于 `main` 分支，它是一个简单的数字表盘。

## 特点

[可用]

- 模拟表盘
- 彩虹旗的颜色，可编辑
- 开启/关闭秒针以节省电量
- 息屏提醒下关闭秒针
- 本地化为 EN、ZH-CN - 颜色尚未完成

[正在工作]

- 表盘插槽
- 暂不支持 TalkBack
- 更多的表盘模板

## 什么是 WFF?

> 表盘格式是一种声明性 XML 格式，用于设计表盘的外观与行为。这意味着创建表盘时不涉及执行代码，您的表盘
> APK 中也不会有内嵌代码。
> 2023 Google I/O 推出。
> [Introducing the Watch Face Format for Wear OS](https://android-developers.googleblog.com/2023/05/introducing-watch-face-format-for-wear-os.html)

*Watch Face Format* 仅可用于 Wear OS 4 及以上。

### 截图

![Watch Face screenshot with Pixel Watch skin](/resources/screenshots/pride_us.png)

## 参考

- [培训 - 表盘格式](https://developer.android.com/training/wearables/wff)
- [XML 参考 - 表盘格式](https://developer.android.com/training/wearables/wff/watch-face)

## 这个项目的目的是什么？

- 文档不够清晰
- 没有官方示例

## 无法在我的手表上运行

**您必须先了解表盘格式才能使用这个项目。**

**此处的所有功能新增于 Wear OS 4，不适用于 Wear OS 3 及以下。**

## 如何运行

- 构建 Gradle
- 启动 Wear OS **4** 模拟器
- 添加一个配置，之后运行在模拟器上
- 手动在表盘选择器里选择表盘