#github安装指南
http://gitlab.corp.anjuke.com/_bi/dw_team/blob/master/%E6%8A%80%E6%9C%AF%E6%96%87%E6%A1%A3/Git%E4%BD%BF%E7%94%A8%E6%8C%87%E5%8D%97.md

#克隆
git clone git@gitlab.corp.anjuke.com:_bi/dw_trunk.git

#复制
enter（前提是要先打开快速编辑模式）
#粘贴
shift+insert

cd /d/Git/dw_trunk/dw_simple/broker
cd /d/Git/dw_trunk/dw_view/mysql
D:\Git\dw_trunk\dw_simple\broker
D:\Git\dw_trunk\dw_view\mysql

#git 上传本地文件到服务器
git pull
git add filename
git commit -m 'comments'
git push origin master

#本地修改并保存后，又不想修改了
git reset --hard HEAD

#删除文件
rm -f filename

#查看git状态
git status

#检查
git checkout 


#git窗口常用命令
cd ~/.ssh
ls
ls -rlt