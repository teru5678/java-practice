package cleaning;

public class KyotoCleaningShop implements
                CleaningService {
        string ownerName;
        string address;
        string phone;

        /* シャツを洗う */
        public Shirt washShirt(Shirt s) {
                // 大型洗濯機15分
                return s;
        }

        /* タオルを洗う */
        public Towl washTowl(Towl t) {
                // 大型洗濯機10分
                return t;
        }

        public Coat washCoat(Coat c) {
                // ドライ20分
                return c;
        }
}