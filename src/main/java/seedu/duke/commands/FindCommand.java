package seedu.duke.commands;

import seedu.duke.task.Task;
import seedu.duke.task.TaskList;
import seedu.duke.ui.UI;

/** Prints out all the tasks in the Task list containing the keyword input by user.
 * @param taskList Task list containing the tasks.
 * @param keyword A word parsed by user to search for the tasks containing this word.
 * @param ui Handles the printing of the tasks.
 */
public class FindCommand extends Command {
    private String keyword;

    public FindCommand(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public void execute(TaskList tasks, UI ui, String fw) {
        TaskList matchingTasks = new TaskList();
        String reply = "Here are the matching tasks in your list:\n\t ";
        for (Task task: tasks) {
            if (task.getDescription().contains(keyword)) {
                matchingTasks.add(task);
            }
        }
        for (int i = 1; i <= matchingTasks.size(); i++) {
            reply += i + "." + matchingTasks.get(i - 1);
            if (i < matchingTasks.size()) {
                reply += "\n\t ";
            }
        }
        ui.printReply(reply);
    }
}
