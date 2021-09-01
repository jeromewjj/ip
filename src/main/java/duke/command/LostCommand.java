package duke.command;

import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

/**
 * LostCommand tells user that Duke is not able to understand user's input.
 */
public class LostCommand extends Command {

    /**
     * Informs user that Duke is unable to understand the command.
     *
     * @param tasks Task List that store all current task.
     * @param ui Ui object to interact with user.
     * @param storage Storage that store tasks in hard-drive.
     * @return Lost message to be sent to user.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        return ui.showLost();
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
