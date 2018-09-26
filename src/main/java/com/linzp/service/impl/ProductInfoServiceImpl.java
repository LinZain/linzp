package com.linzp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.Product;
import com.linzp.service.ProductInfoService;

@Service("productInfoService")
public class ProductInfoServiceImpl implements ProductInfoService {
	@Autowired
	private BaseDaoI<Product> execOrderDAO;

	@Override
	public List<Product> queryList(Product role) {
		String hql = "from Product ";
		Map<String, Object> params = new HashMap<String, Object>();
		List<Product> list = execOrderDAO.find(hql + whereHql(role, params), params);
		return list;
	}

	private String whereHql(Product role, Map<String, Object> params) {
		StringBuffer hql = new StringBuffer();
		if (role != null) {
			hql.append(" where 1 = 1 ");
			if (role.getPdtId() != 0) {
				hql.append("and pdt_id = :pdtId");
				params.put("pdtId", role.getPdtId());
			}
			if (StringUtils.isNotBlank(role.getPdtPic())) {
				hql.append("and pdt_pic like :pdtPic");
				params.put("pdtPic", "%" + role.getPdtPic() + "%");
			}
			if (StringUtils.isNotBlank(role.getPdtTitle())) {
				hql.append("and pdt_title like :pdtTitle");
				params.put("pdtTitle", "%" + role.getPdtTitle() + "%");
			}
			if (StringUtils.isNotBlank(role.getPdtPrice())) {
				hql.append("and pdt_price = :pdtPrice");
				params.put("pdtPrice", role.getPdtPrice());
			}
			if (StringUtils.isNotBlank(role.getPromotionPrice())) {
				hql.append("and promotion_price = :promotionPrice");
				params.put("promotionPrice", role.getPromotionPrice());
			}
			if (StringUtils.isNotBlank(role.getPdtBrand())) {
				hql.append("and pdt_brand like :pdtBrand");
				params.put("pdtBrand", "%" + role.getPdtBrand() + "%");
			}
			if (StringUtils.isNotBlank(role.getPdtCategory())) {
				hql.append("and pdt_category = :pdtcategory");
				params.put("pdtcategory", role.getPdtCategory());
			}
			if (StringUtils.isNotBlank(role.getPdtDetial())) {
				hql.append("and pdt_detial like :pdtDetial");
				params.put("pdtDetial", "%" + role.getPdtDetial() + "%");
			}
			if (StringUtils.isNotBlank(role.getPicDir())) {
				hql.append("and pic_dir = :picDir");
				params.put("PicDir", role.getPicDir());
			}
			if (role.getPdtInventory() != 0) {
				hql.append("and pdt_inventory = :pdtInventory");
				params.put("pdtInventory", role.getPdtInventory());
			}
			if (role.getPdtStatus() != 0) {
				hql.append("and pdt_status = :pdtStatus");
				params.put("dtStatus", role.getPdtStatus());
			}
			if (StringUtils.isNotBlank(role.getPdtLastUpdate())) {
				hql.append("and pdt_lastUpdate = :pdtLastUpdate");
				params.put("pdtLastUpdate", role.getPdtLastUpdate());
			}
		}
		return hql.toString();
	}

	@Override
	public Long getListCount(Product role) {
		Map<String, Object> params = new HashMap<String, Object>();
		StringBuilder hql = new StringBuilder("select count(*) from Product ");
		hql.append(whereHql(role, params));
		Long total = execOrderDAO.count(hql.toString(), params);
		return total;
	}

	public List<Product> getListByGroupId(String groupId) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "select * from tb_product where pdt_id in (select pdt_id from tb_groupNumber where group_id= :groupId)";
		params.put("groupId", groupId);

		List<Product> list = (List<Product>) execOrderDAO.findEntityBySql(hql, params,Product.class);
		return list;
	}

	@Override
	public List<Product> getListByActId(String actId) {
		Map<String, Object> params = new HashMap<String, Object>();
		String sql = "select * from tb_product where pdt_id in(select pdt_id from tb_promoteProduct where act_id= :actId and pmtpdt_status='0')";
		params.put("actId", actId);

		List<Product> list = (List<Product>) execOrderDAO.findEntityBySql(sql, params, Product.class);
		return list;
	}

}
