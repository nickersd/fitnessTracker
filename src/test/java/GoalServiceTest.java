import com.nickerson.model.Goal;
import com.nickerson.repository.GoalRepository;
import com.nickerson.service.GoalService;
import com.nickerson.service.GoalServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GoalServiceTest {

    @Mock
    GoalRepository goalRepository;

    @InjectMocks
    GoalService goalService = new GoalServiceImpl();

    @Before
    public void setUp() {
       // goalRepository = Mockito.mock(GoalRepositoryImpl.class);
    }

    @Test
    public void testGoalService() {
    Goal myGoal = new Goal();
        myGoal.setMinutes(10);
        goalService.save(myGoal);
        verify(goalRepository).save(myGoal);

    }


}