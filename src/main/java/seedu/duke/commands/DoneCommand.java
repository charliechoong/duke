package seedu.duke.commands;

import seedu.duke.storage.Storage;
import seedu.duke.task.TaskList;
import seedu.duke.ui.UI;

/*
 * This class represents the "done" command to mark a task as done.
 */
public class DoneCommand extends Command{
    private int taskIndex;

    public DoneCommand(int taskIndex){
        this.taskIndex = taskIndex;
    }

    @Override
    public void execute(TaskList tasks, UI ui, Storage storage) {
        ui.printReply(tasks.get(taskIndex - 1).markAsDone());
    }
}
