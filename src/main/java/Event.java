public class Event extends Task {
    protected Date at;

    public Event(String description, Date at){
        super(description);
        this.at = at;
    }

    @Override
    public String toFile(){
        return "E | " + (isDone?"1":"0") + " | " + this.description + " | " + this.at + "\n";
    }
    @Override
    public String toString(){
        return "[E]" + super.toString() + " (at: " + at + ")";
    }
}
