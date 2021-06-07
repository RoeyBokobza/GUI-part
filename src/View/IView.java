package View;

import ViewModel.MyViewModel;

import java.util.Observer;

public interface IView extends Observer {
    void setViewModel(MyViewModel viewModel);

    void generateMaze(int rows, int cols);
}

