public class Minimax{
	
	public void evalute(Tree<GameNode> t){
		t.getRootElement().getData().setValue(max(t.getRootElement()));
	}
	
	public int min(Node<GameNode> n){
		int minValue = -1;
		for(int i = 0; i < n.getNumberOfChildren(); i++){
			if(!n.getChildren().get(i).getData().hasValue()){
				n.getChildren().get(i).getData().setValue(max(n.getChildren().get(i)));
			}
			int value = n.getChildren().get(i).getData().getValue();
			if(minValue < 0)
				minValue = value;
			else{
				if(minValue > value){
					minValue = value;
				}
			}
		}
		return minValue;
	}

	public int max(Node<GameNode> n){
		int maxValue = -1;
		for(int i = 0; i < n.getNumberOfChildren(); i++){
			if(!n.getChildren().get(i).getData().hasValue()){
				n.getChildren().get(i).getData().setValue(min(n.getChildren().get(i)));
			}
			int value = n.getChildren().get(i).getData().getValue();
				if(maxValue < value){
					maxValue = value;
			}
		}
		return maxValue;
	}

	public void run(){
		GameTree t = new GameTree();
		t.setExample1();
		System.out.println("Tree Before Evaluation");
		t.displayTree();
		evalute(t.getTree());
		System.out.println("Tree After Evaluation");
		t.displayTree();
	}
}
