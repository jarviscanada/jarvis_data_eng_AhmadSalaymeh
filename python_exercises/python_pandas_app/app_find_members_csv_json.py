import sys
import pandas as pd

def find_members_by_city(csv_file,city_name,output_file):
    members_df=pd.read_csv(csv_file)
    members_city_df=members_df.loc[members_df['address'].str.contains(city_name)]
    return members_city_df.to_json(output_file)


def main():
    csv_file = sys.argv[1]
    city_name=sys.argv[2]
    output_file= sys.argv[3]
    find_members_by_city(csv_file,city_name,output_file)
    


if __name__ == "__main__":
    main()