package za.ac.pgdswd.interceptors;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		boolean flag = true;
		int dayOfWeek = Calendar.DAY_OF_WEEK;
		
		if (dayOfWeek ==1){
			response.getWriter().write("The website can is not  accessible on Sunday");
			flag = false;
		}
		return flag;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, 
							Object handler, ModelAndView modelAndView) throws Exception{
		
		System.out.println("Called post handle for "+request.getRequestURI().toString());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
								Object handler, Exception ex) throws Exception {
		
		System.out.println("Called after completion for "+request.getRequestURI().toString());
		
	}
	
}
