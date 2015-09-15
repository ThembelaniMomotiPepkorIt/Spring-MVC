package za.ac.pgdswd.interceptors;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{
	boolean flag = true;
	public boolean preHandle(HttpServletRequest request,
							HttpServletResponse response, 
							Object handler) throws Exception{
		
		int dayOfWeek = Calendar.DAY_OF_WEEK;
		if (dayOfWeek ==1){
			response.getWriter().write("The website can is not  accessible on Sunday");
			flag = false;
		}
		return flag;
	}
}
