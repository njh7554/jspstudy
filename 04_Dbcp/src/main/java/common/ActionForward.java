package common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ActionForward {
	private String Path; 		// 이동할 Jsp 경로
	private boolean isRedirect; // 이동 방식(true이면 redirect, false이면 forward)
	
}


