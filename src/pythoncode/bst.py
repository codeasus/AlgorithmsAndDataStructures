class Node: 
    def __init__(self, data):
        self.data  = data
        self.left  = None
        self.right = None
        self.list  = []
    
    def search(self, node, target): 
        if node.data == target: 
            return True
        if node.data > target: 
            return self.search(node.left, target)
        elif node.data < target:
            return self.search(node.right, target)

    def traversePreorder(self): 
        print(self.data)
        if self.left:
            self.left.traversePreorder()
        if self.right: 
            self.right.traversePreorder()

    def traverseInorder(self):
        if self.left:
            self.left.traversePreorder()
        print(self.data)
        if self.right: 
            self.right.traversePreorder()

    def traversePostorder(self):
        if self.left:
            self.left.traversePreorder()
        if self.right: 
            self.right.traversePreorder()
        print(self.data)

    def height(self, h=0): 
        left_height  = self.left.height(h + 1) if self.left else h
        right_height = self.right.height(h + 1) if self.right else h 

        return max(left_height, right_height)
    
    def getNodesAtDepth(self, depth, nodes=[]) :
        if depth == 0: 
            nodes.append(self.data)
            return nodes
        
        if self.left:
            self.left.getNodesAtDepth(depth - 1, nodes)
        else: 
            nodes.extend([None]*2**(depth-1))
        if self.right:
            self.right.getNodesAtDepth(depth - 1, nodes)
        else: 
            nodes.extend([None]*2**(depth-1))

        return nodes

    def display(self, tree=[]):
        pass

class Tree: 
    def __init__(self, root, name):
        self.root = root
        self.name = name

    def search(self, tree, target):
        return self.root.search(tree.root, target)

    def traversePreorder(self):
        return self.root.traversePreorder()

    def traverseInorder(self):
        return self.root.traverseInorder()
    
    def traversePostorder(self):
        return self.root.traversePostorder()

    def height(self): 
        return self.root.height(0)
    
    def getNodesAtDepth(self, depth, nodes):
        return self.root.getNodesAtDepth(depth, nodes)