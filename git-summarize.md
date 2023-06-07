# 部署总结
### 一、 创建仓库
![img.png](images/img.png)
...注意保存ssh后的地址，配置远程数据需要用
### 创建本地项目
1. 创建项目并配置本地数据源
![img.png](images/img_1.png)
注意：此处的数据源设置为项目文件夹
2. 配置远程数据源
![img.png](images/img_2.png)
若此处报错，显示没有权限，则需要使用git工具生成ssh
3. git命令生成ssh
```text
ssh-keygen -t rsa -C "邮箱"
```
该命令生成pub文件，将其中的内容拷贝到github上
![img_png](images/img_3.png)
4.再添加远程数据源
![img_png](images/img_4.png)
最后commit-push项目文件即可