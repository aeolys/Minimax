public class GameTree{
	private Tree<GameNode> gameTree;
	
	public GameTree(){
		gameTree = new Tree<GameNode>();
		Node<GameNode> temp = new Node<GameNode>();
		gameTree.setRootElement(temp);
	}
	
	public Tree<GameNode> getTree(){
		return gameTree;
	}
	
	public void displayTree(){
		Node<GameNode> n = gameTree.getRootElement();
		System.out.println(n.getData().getLabel()+" "+n.getData().getValue());
		for(int i = 0; i < n.getNumberOfChildren(); i++){
			System.out.println(n.getChildren().get(i).getData().getLabel()+" "+n.getChildren().get(i).getData().getValue());
			displayTreeContinue(n.getChildren().get(i));
		}
	}
	private void displayTreeContinue(Node<GameNode> n){
		for(int i = 0; i < n.getNumberOfChildren(); i++){
			System.out.println(n.getChildren().get(i).getData().getLabel()+" "+n.getChildren().get(i).getData().getValue());
			displayTreeContinue(n.getChildren().get(i));
		}
	}
	
	public void setExample1(){
		gameTree.getRootElement().setData(new GameNode('A'));
		gameTree.getRootElement().addChild(new Node<GameNode>(new GameNode('B')));
		gameTree.getRootElement().addChild(new Node<GameNode>(new GameNode('C')));
		gameTree.getRootElement().addChild(new Node<GameNode>(new GameNode('D')));
		
		gameTree.getRootElement().getChildren().get(0).addChild(new Node<GameNode>(new GameNode('E')));
		gameTree.getRootElement().getChildren().get(0).addChild(new Node<GameNode>(new GameNode('F')));
		gameTree.getRootElement().getChildren().get(1).addChild(new Node<GameNode>(new GameNode('G')));
		gameTree.getRootElement().getChildren().get(1).addChild(new Node<GameNode>(new GameNode('H')));
		gameTree.getRootElement().getChildren().get(2).addChild(new Node<GameNode>(new GameNode('I')));
		gameTree.getRootElement().getChildren().get(2).addChild(new Node<GameNode>(new GameNode('J')));
		
		gameTree.getRootElement().getChildren().get(0).getChildren().get(0).addChild(new Node<GameNode>(new GameNode('K', 2)));
		gameTree.getRootElement().getChildren().get(0).getChildren().get(0).addChild(new Node<GameNode>(new GameNode('L', 1)));
		gameTree.getRootElement().getChildren().get(0).getChildren().get(0).addChild(new Node<GameNode>(new GameNode('M', 3)));
		gameTree.getRootElement().getChildren().get(0).getChildren().get(1).addChild(new Node<GameNode>(new GameNode('N', 5)));
		gameTree.getRootElement().getChildren().get(0).getChildren().get(1).addChild(new Node<GameNode>(new GameNode('O', 4)));
		gameTree.getRootElement().getChildren().get(1).getChildren().get(0).addChild(new Node<GameNode>(new GameNode('P', 7)));
		gameTree.getRootElement().getChildren().get(1).getChildren().get(1).addChild(new Node<GameNode>(new GameNode('Q', 6)));
		gameTree.getRootElement().getChildren().get(1).getChildren().get(1).addChild(new Node<GameNode>(new GameNode('R', 8)));
		gameTree.getRootElement().getChildren().get(2).getChildren().get(0).addChild(new Node<GameNode>(new GameNode('S', 9)));
		gameTree.getRootElement().getChildren().get(2).getChildren().get(0).addChild(new Node<GameNode>(new GameNode('T', 10)));
		gameTree.getRootElement().getChildren().get(2).getChildren().get(1).addChild(new Node<GameNode>(new GameNode('U', 12)));
		gameTree.getRootElement().getChildren().get(2).getChildren().get(1).addChild(new Node<GameNode>(new GameNode('V', 11)));
	}
}