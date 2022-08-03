import os
import sys
import platform


def title2path(title: str):
    path = title.replace(' ', '')
    path = 'Q' + '0' * (4 - len(path.split('.')[0])) + path
    path = path.replace('.', '_')
    filename = "Solution.java"
    return path + '.' + filename


def copy2clipboard(s: str):
    cmd = ' | pbcopy'
    if "win" in platform.system().lower():
        cmd = ' | clip'
    cmd = 'echo ' + s + cmd
    os.system(cmd)


if __name__ == '__main__':
    res = title2path(" ".join(sys.argv[1:]))
    print(res)
    copy2clipboard(res)
    print("Copied to your clipboard!")
