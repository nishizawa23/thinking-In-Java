import os

rootdir = "/Users/pete_doherty/test/thinking-in-java"


def del_windows_ends(file):
    new_file = "".encode('utf-8')
    file_id = open(file, 'rb')
    chunk = 100
    while True:
        fragment = file_id.read(chunk)
        if not fragment:
            break
        new_file += fragment

    file_id.close()

    file_id = open(file, 'wb')
    file_id.write(new_file.replace("\r\n".encode('utf-8'), "\n".encode('utf-8')))
    file_id.close()


for parent, dirnames, filenames in os.walk(rootdir):  # 三个参数：分别返回1.父目录 2.所有文件夹名字（不含路径） 3.所有文件名字

    for filename in filenames:
        if filename != ".DS_Store" and filename != ".gitignore" \
                and not ".class" in filename \
                and not ".git" in parent \
                and not ".gradle" in parent \
                and not "build" in parent:
            del_windows_ends(os.path.join(parent, filename))
