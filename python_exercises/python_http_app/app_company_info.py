import json
import sys
from urllib import response
import requests



URL="https://google-finance4.p.rapidapi.com/ticker/"
HEADERS = {
	"X-RapidAPI-Key": "6b89eceac5msh50a59b93ab8e2b6p1fd980jsn87c3cd411ee6",
	"X-RapidAPI-Host": "google-finance4.p.rapidapi.com"
}

def find_company_info(ticker=None):
    querystring = {"t":ticker,"hl":"en","gl":"US"}
    response = requests.request("GET",URL,headers=HEADERS,params=querystring)
    json_response = json.loads(response.text)
    print(json_response["info"]["title"],"\n",json_response["about"]["ceo"],"\n",json_response["price"]["previous_close"])



def main():
    ticker=sys.argv[1]
    find_company_info(ticker=ticker.upper())
    


if __name__ == "__main__":
    main()