
import Bst._

object Tree{

	def main ( args:Array[String])
	{
		var ob=new Node(56,null,null);
		var root=new Node(56,null,null);
		println(ob.printdata);
		ob.createLeft(54)
		ob.createRight(96)
	
		ob.createNode(ob,78)
		ob.createNode(ob,89)
		ob.createNode(ob,34)

		
		println("Printing Tree")

		root.printTree(ob)

		println("Deleting")
	
		root.deleteNode(ob,34)

		println("Printing Tree")

		root.printTree(ob)

	}

}
