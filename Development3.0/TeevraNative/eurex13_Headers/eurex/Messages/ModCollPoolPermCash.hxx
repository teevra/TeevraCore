/* Generated by Xgen from: E130.18.01 SIR 152405 on: 2010-03-30 15:12 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   ModCollPoolPermCash.hxx
*
*  DESCRIPTION: Layouts used for
*               Modify Collateral Pool Permanent Cash
*
*******************************************************************************/

#ifndef _MODCOLLPOOLPERMCASH_HXX_
#define _MODCOLLPOOLPERMCASH_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_MOD_COLL_POOL_PERM_CASH_GRP_MAX      100
#define BSC_MOD_COLL_POOL_PERM_CASH_REC_MAX      100

/******************************************************************************/

#ifndef _BSC_MOD_COLL_POOL_PERM_CASH_GRP_T_
#define _BSC_MOD_COLL_POOL_PERM_CASH_GRP_T_

typedef struct bscModCollPoolPermCashGrpTag
{
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             permCshAmnt     [DRIV_AMOUNT_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscModCollPoolPermCashGrpT, *pBscModCollPoolPermCashGrpT;

#endif  /* _BSC_MOD_COLL_POOL_PERM_CASH_GRP_T_ */

/******************************************************************************/

#ifndef _BSC_MOD_COLL_POOL_PERM_CASH_REQUEST_T_
#define _BSC_MOD_COLL_POOL_PERM_CASH_REQUEST_T_

typedef struct bscModCollPoolPermCashRequestTag
{
    char             collPoolId      [DRIV_COLL_POOL_ID_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscModCollPoolPermCashGrpT bscModCollPoolPermCashGrp [BSC_MOD_COLL_POOL_PERM_CASH_GRP_MAX];
} bscModCollPoolPermCashRequestT, *pBscModCollPoolPermCashRequestT;

#endif  /* _BSC_MOD_COLL_POOL_PERM_CASH_REQUEST_T_ */

/******************************************************************************/

#ifndef _MOD_COLL_POOL_PERM_CASH_REQUEST_T_
#define _MOD_COLL_POOL_PERM_CASH_REQUEST_T_

typedef struct modCollPoolPermCashRequestTag
{
    dataHeaderT      header;
    bscModCollPoolPermCashRequestT basic;
} modCollPoolPermCashRequestT, *pModCollPoolPermCashRequestT;

#endif  /* _MOD_COLL_POOL_PERM_CASH_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_MOD_COLL_POOL_PERM_CASH_REC_T_
#define _BSC_MOD_COLL_POOL_PERM_CASH_REC_T_

typedef struct bscModCollPoolPermCashRecTag
{
    char             rtnCod          [RTN_COD_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscModCollPoolPermCashRecT, *pBscModCollPoolPermCashRecT;

#endif  /* _BSC_MOD_COLL_POOL_PERM_CASH_REC_T_ */

/******************************************************************************/

#ifndef _BSC_MOD_COLL_POOL_PERM_CASH_RESPONSE_T_
#define _BSC_MOD_COLL_POOL_PERM_CASH_RESPONSE_T_

typedef struct bscModCollPoolPermCashResponseTag
{
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscModCollPoolPermCashRecT bscModCollPoolPermCashRec [BSC_MOD_COLL_POOL_PERM_CASH_REC_MAX];
} bscModCollPoolPermCashResponseT, *pBscModCollPoolPermCashResponseT;

#endif  /* _BSC_MOD_COLL_POOL_PERM_CASH_RESPONSE_T_ */

/******************************************************************************/

#ifndef _MOD_COLL_POOL_PERM_CASH_RESPONSE_T_
#define _MOD_COLL_POOL_PERM_CASH_RESPONSE_T_

typedef struct modCollPoolPermCashResponseTag
{
    dataHeaderT      header;
    bscModCollPoolPermCashResponseT basic;
} modCollPoolPermCashResponseT, *pModCollPoolPermCashResponseT;

#endif  /* _MOD_COLL_POOL_PERM_CASH_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _MODCOLLPOOLPERMCASH_HXX_ */

/******************************************************************************/
/* End of file ModCollPoolPermCash.hxx */
/******************************************************************************/
