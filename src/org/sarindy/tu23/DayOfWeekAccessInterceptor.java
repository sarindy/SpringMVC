package org.sarindy.tu23;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekAccessInterceptor extends HandlerInterceptorAdapter  {

	@SuppressWarnings("static-access")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		Calendar calendar=Calendar.getInstance();
		
		int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);
		
		if( dayOfWeek == 1 ){
			response.getWriter().write("You can not work on Sunday.");;
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("After Completetion" + request.getRequestURI().toString()+ " "+ request.getRequestURL().toString());
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("Post Handler" + request.getRequestURI().toString()+ " "+ request.getRequestURL().toString());
	}
	
	
	
	
	
	
	

}
