import com.nickerson.model.Exercise;
import com.nickerson.model.Goal;
import com.nickerson.repository.ExerciseRepository;
import com.nickerson.service.ExerciseServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;

/**
 * Created by dnickerson on 4/12/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class ExerciseServiceTest {

    @Mock
    private ExerciseRepository exerciseRepository;

    @InjectMocks
    private ExerciseServiceImpl exerciseService;

    @Test
    public void testSaveExercise() {
        Exercise exercise = new Exercise();
        Goal goal = new Goal();
        exercise.setGoal(goal);
        exercise.setMinutes(10);
        exercise.setActivity("Running");
        List<Exercise> exerciseList = new ArrayList<Exercise>();
        exerciseList.add(exercise);
        goal.setExercises(exerciseList);
        exerciseRepository.save(exercise);
        verify(exerciseRepository).save(exercise);

    }
}
