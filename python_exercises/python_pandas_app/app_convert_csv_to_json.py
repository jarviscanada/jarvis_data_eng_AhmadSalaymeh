import sys
import pandas as pd



def csv_2_json(input_csv,output_json):
    df = pd.read_csv(input_csv)
    return df.to_json(output_json+".json")


def main():
    file_name = sys.argv[1]
    output_file_name= sys.argv[2]
    print("hello docker")
    csv_2_json(input_csv=file_name,output_json=output_file_name)
    


if __name__ == "__main__":
    main()