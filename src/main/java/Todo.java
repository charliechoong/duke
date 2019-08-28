public class Todo extends Task{
    public Todo(String description){
        super(description);
    }

    @Override
    public String toFile(){
       return "T | " + (isDone?"1":"0") + " | " + this.description + "\n";
    }

    @Override
    public String toString(){
        return "[T]" + super.toString();
    }
}
