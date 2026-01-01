# ZenFocus 🧘

> 一款结合番茄工作法与轻量待办的 Android 混合开发效率工具。
> A minimalist Android Hybrid App designed for flow state and productivity.

![Android](https://img.shields.io/badge/Platform-Android-green)
![Tech](https://img.shields.io/badge/Tech-Java%20%2B%20React%20%2B%20Tailwind-blue)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

## 📖 项目简介 (Introduction)

**ZenFocus** 是一款针对移动端碎片化场景设计的效率应用。它摒弃了繁杂的功能，通过极简的单页设计（Single Page Design），将“番茄工作法”与“流式待办清单”完美融合，帮助用户快速进入心流状态。

本项目采用 **Hybrid App（混合开发）** 架构，利用 Android 原生 Shell 作为容器，核心业务逻辑与界面渲染完全由 Web 技术栈（React 18 + Tailwind CSS）实现，实现了“一次编写，随处运行”的灵活性，且无臃肿的 `node_modules` 依赖。

## ✨ 核心功能 (Features)

* **⏳ 可视化专注计时 (Visual Timer)**
    * 摒弃枯燥数字，采用 SVG 动态圆环展示进度。
    * 支持标准番茄模式（25分钟）与小憩模式（5分钟），及自定义时长。
* **✅ 流式待办清单 (Flow Task List)**
    * 支持任务快速录入与勾选，交互流畅。
    * **数据持久化**：利用 DOM Storage 映射 Android 文件系统，杀进程数据不丢失。
* **📜 每日智慧 (Daily Wisdom)**
    * 集成 Hitokoto 一言 API，每次启动随机展示一条激励短句，提升产品温度。
* **📱 沉浸式体验**
    * 完美适配 Android 状态栏（Light Status Bar Mode）。
    * 无感键盘适配：输入框智能避让软键盘，无遮挡。

## 🛠 技术栈 (Tech Stack)

本项目采用轻量化的混合开发架构：

| 模块 | 技术选型 | 说明 |
| :--- | :--- | :--- |
| **Native 容器** | **Android SDK (Java)** | 处理 WebView 生命周期、状态栏适配、权限管理 |
| **UI 构建** | **React 18** | 函数式组件、Hooks 状态管理 |
| **样式系统** | **Tailwind CSS** | CDN 引入，原子化 CSS，极速构建 UI |
| **编译器** | **Babel Standalone** | 浏览器端实时编译 JSX，无需本地 Node 环境 |
| **图标库** | **Phosphor Icons** | 现代化矢量图标库 |

## 📂 项目结构 (Project Structure)

核心代码逻辑位于 `assets` 目录下的单文件中，结构清晰：

```text
app/src/main
├── java/com/example/myapplication
│   └── MainActivity.java       # Android 原生容器，配置 WebView 和状态栏
├── assets
│   ├── index.html              # 核心文件：包含 React 组件、样式和业务逻辑
│   └── logo.png                # 应用 Logo 资源
└── res                         # 原生资源文件 (图标、Manifest 等)
```
## 🚀 快速开始 (How to Run)

1. **克隆仓库**

   ```Bash
   git clone [https://github.com/YourUsername/ZenFocus.git](https://github.com/YourUsername/ZenFocus.git)
   ```

2. **打开项目**

   - 启动 Android Studio。
   - 选择 `File` -> `Open`，选中项目根目录。

3. **运行**

   - 连接 Android 真机或启动模拟器。
   - 点击顶部工具栏的绿色 ▶️ 运行按钮。


## 👤 作者 (Author)

- **唐鑫**
- 学校：武汉大学
- 提交日期：2026年1月1日
