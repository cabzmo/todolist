public class TodoListItem {
	
	private String description;
	private int priority;
	private boolean completed;
	
	public TodoListItem(String description, int priority) {
		this.description = description;
		this.priority = priority;
		this.completed = false;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getPriority() {
		return this.priority;
	}
	
	public boolean isDone() {
		return this.completed;
	}
	
	public void markDone() {
		this.completed = true;
	}

}
