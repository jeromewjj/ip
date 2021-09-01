package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

/**
 * DoneCommand mark task done in task list.
 */
public class DoneCommand extends Command {
    private int taskNumber;

    /**
     * Constructs DoneCommand object.
     *
     * @param taskNumber Task number of the task to be marked done.
     */
    public DoneCommand(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    /**
     * Marks done task in Task List and Storage.
     * Return done message to be sent to the user.
     *
     * @param tasks Task List that store all current task.
     * @param ui Ui object to interact with user.
     * @param storage Storage that store tasks in hard-drive.
     * @return Done message to be sent to user.
     * @throws DukeException If arguments enters has error.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        tasks.doneTask(taskNumber);
        storage.save(tasks);
        return ui.showDone(tasks.getTask(taskNumber));
    }

    /**
     * Checks whether the command is an exit command.
     *
     * @return Boolean whether command is an exit command.
     */
    @Override
    public boolean isExit() {
        return false;
    }

}
