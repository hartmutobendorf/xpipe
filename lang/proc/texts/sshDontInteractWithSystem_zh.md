## 外壳类型检测

XPipe 的工作原理是检测连接的 shell 类型，然后与活动 shell 进行交互。不过，这种方法只有在 shell 类型已知并支持一定数量的操作和命令时才有效。所有常见的 shell，如 `bash`, `cmd`, `powershell` 等，均可支持。

## 未知 shell 类型

如果您连接的系统不运行已知的命令 shell，例如路由器、链接或某些物联网设备，XPipe 将无法检测 shell 类型，并在一段时间后出错。启用该选项后，XPipe 将不会尝试识别 shell 类型，而是按原样启动 shell。这样，您就可以无差错地打开连接，但该连接将不支持文件浏览器、脚本、子连接等许多功能。
