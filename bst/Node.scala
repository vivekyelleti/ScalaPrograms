
package Bst
{
	class Node (var data:Int,var r:Node,var l:Node)
	{

		var value:Int =data
		var right:Node = r
		var left:Node = l

		def printdata()
		{
			println(this.value)
		}

		def createLeft(data:Int)
		{
			var leftNew=new Node(data,null,null)
			this.left=leftNew
			println("data "+leftNew.printdata())

		}

		def createRight(data:Int)
		{
			var rightNew=new Node(data,null,null)
			this.right=rightNew
			println(rightNew.printdata())

		}

		def delete(root:Node,data:Int)
		{
			var rcount:Int=0
			var lcount:Int=0
			var lNode:Node=root
			var rNode:Node=root

			println("delete",lNode.value)
			while(lNode.left!=null)
			{
				println("left")
				lNode=lNode.left
				lcount+=1
			}
	
			while(rNode.right!=null)
			{
				rNode=rNode.right
				rcount+=1 
			}
			println("lcount",lcount);
			println("rcount",rcount);
			if(lcount==0 && rcount==0)
			{
				println("COUNT 0");
				this.value=0;
				this.left=null;
				this.right=null;
				//root=null;
			}
			else if(lcount >0 && rcount >0)
			{

				rNode=root.right
				var prev:Node=null
				while(rNode.left!=null)
				{
				rNode=rNode.left
				}
				
				//root.right.left=rNode
				this.value=rNode.value
				if(rNode.right!=null)
				{
				rNode.value=rNode.right.value
				rNode.right=null
				rNode.left=null
				}
				else
				rNode.value=0
				//this.left=rNode.left
				//this.right=rNode.right
			}
			else if(lcount >0)
			{
				lNode=root.left
				this.value=lNode.value;
				this.left=lNode.left;
				this.right=rNode.right;
			}
			else
			{
				rNode=root.right
				this.value=rNode.value;
				this.left=rNode.left;
				this.right=rNode.right;
			}
	
		}

		def createNode (root:Node,data: Int)
		{
		
			println(this.value, data)
			if(root.value > data)
			{
				println("left")
				if(root.left!=null)
				createNode(root.left,data)
				else 
				root.createLeft(data)
			}
			else
			{
				println("right")
				if(root.right==null)
				root.createRight(data)
				else 
				createNode(root.right,data)
	
			}
	
		}
		
		def deleteNode (root:Node,data:Int)
		{
			

			println("Deleting NOde")
			if(root.value > data)
			{
				println("left")
				if(root.left!=null)
				{
				deleteNode(root.left,data)
				}
				//else
				//println("Value not found")
			}
			else if(root.value < data)
			{
				println("right")
				if(root.right==null)
				println("Value not found")
				else
				deleteNode(root.right,data)
			}
			else
			{
				println("ROOT",root.value)
				root.delete(root,data)
			}

		}


		def printTree(root:Node)
		{
			if(root!=null)
			{
				printTree(root.left)
				println(root.value)
				printTree(root.right)
			}
		}


	}

}
