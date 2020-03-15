package seedu.duke.command;

import seedu.duke.storage.Storage;
import seedu.duke.ui.Ui;

import java.io.IOException;

/**
 * Empty constructor. Only used to create the ListAppointmentCommand object
 */
public class ListAppointmentCommand extends Command {
    
    public static final String MESSAGE_USAGE = "lista : List all the appointments.\n"
            + "Example: lista";

    public ListAppointmentCommand() {
    }

    /**
     * For this execution, it shows the list of appointments that are stored
     * @param ui the ui object which can be used to display text
     * @param storage the storage object for auto saving function
     * @throws IOException
     */
    @Override
    public void execute(Ui ui, Storage storage) throws IOException {
        /* TODO: Justin please implement this method to show all the list of appointments thanks*/
        Ui.showEntireAppointmentList();

    }
}

