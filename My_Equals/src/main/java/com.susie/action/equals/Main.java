package com.susie.action.equals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualsJson eqType = new EqualsJson();
		String standardData = "{'uid':123,'phone':1,'has_password':true,'location':{'province':true,'city':null,'aass':'www'},'cpma':null, 'name':'susie'}";

		//String standardData = "{'error_code':20212,'error_message':'verify password not pass','error_description':'\\u7528\\u6237\\u8d26\\u53f7\\u6216\\u5bc6\\u7801\\u9519\\u8bef','data':null}";

		String resData = "{'data':{'uid':124,'phone':'1','has_password':False,'location':null,'cpma':null}}";


		 //resData = "{'data':{'error_code':20212,'error_message':'verify password not pass','error_description':'\\u7528\\u6237\\u8d26\\u53f7\\u6216\\u5bc6\\u7801\\u9519\\u8bef','data':null}}}}";


		boolean result;

		result = eqType.respTypeAssertion(standardData, resData);
        System.out.println(result);

		EqualsJsonValue eqJsonValue = new EqualsJsonValue();
		boolean result2;
		result2 = eqJsonValue.respValueAssertion(standardData, resData);
		System.out.println(result2);
	}

}
