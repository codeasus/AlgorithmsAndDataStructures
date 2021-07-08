import os

def displayPath(current_path, intend=u'\xB7'):
    if os.path.isfile(current_path): 
        print(current_path)

    if os.path.isdir(current_path):
        for file_ in os.listdir(current_path): 
            if os.path.isfile('{}\\{}'.format(current_path, file_)): 
                print('{0}{1}\\{2}'.format(intend*2, current_path, file_))
            if os.path.isdir('{}\\{}'.format(current_path, file_)): 
                print('{0}{1}\\{2}'.format(intend*2, current_path, file_))
                displayPath('{}\\{}'.format(current_path, file_), intend=intend*2)

def convertPathToTree(current_path) :
    pass