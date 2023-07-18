# Trees-DataStructure
Why we use tree data structure?
  Because operation like insertion , deletion and search are happen in O(log n) time.
  Cost effecient ordered storage in bst
Limitation of o(log n) time comes in unbalanced binary trees.
Solution for this ---> self balnced binary trees(AVL, Red Black Trees)

Where Binary Trees are used?
  File Systems
  Databases(B+ and B- trees)
  Decision Trees (in Machine Learning)
  Networking
  Compression of files(huffman coding)

Properties for a tree:- 
  size -> total number of nodes
  Parent and child relationships
  siblings (two nodes have same parents)
  edge -> pointers conneting two nodes
  heights --> maximum number of edges from that node(for which you are couting height) and leaf node
  leaf --> nodes with no child
  level --> difference of height beteen that node and root node

Types of Biary tree:- 
  Complete binary tree:- all levels are fully filled apart from alst level. but if it is filled it is to be filled from left to right.
  Full binary tree :- Each node has either zero children or two children. is use case is compression.
  Perfect binary tree:- all levels are filled.
  skewed binary tree:- every node has only one child.
  ordered BT :- every node follows some properties and conditions ; example Binary search trees

some points: - 
  in perfect binary tree of height h, total number of nodes is 2^(h+1) - 1 .
  if n is no of leaves nodes then it has log(n) + 1 levels atleast .
  in strict binary tree, if n is no. of leaf nodes then we have n -1 internal nodes.

#Implementation
  Two implementation;- linked implementation and sequential implementation.
  here we are proceeding with linked implementation.

  1. In insert function -> first it is checking the insert for left then insert for right.


  
  
