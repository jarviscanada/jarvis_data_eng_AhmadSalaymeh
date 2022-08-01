import pandas as pd

from python_pandas_app.app_find_members_csv_json import find_members_by_city

def test_find_members_by_city():
    find_members_by_city('tests/members.csv','New York','tests/find_members_by_city.json')
    temp_json=pd.read_json('tests/find_members_by_city.json')
    test_json=pd.read_json('tests/found_members_test.json')
    assert(temp_json.equals(test_json))